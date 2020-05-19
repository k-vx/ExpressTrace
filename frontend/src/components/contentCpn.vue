<template>
    <div>
        <el-input v-model="expressNumber" placeholder="请输入单号"></el-input>
        <el-button type="primary" plain @click="findExpress">查询</el-button>
        <el-table
        :data="tableData"
        style="width: 100%">
            <el-table-column
                prop="date"
                label="日期"
                width="220">
            </el-table-column>

            <el-table-column
                prop="status"
                label="物流状态">
            </el-table-column>
        </el-table>
    </div>
</template>

<script>

import request from '../network/request'

export default {
    name: 'contentCpn',
    data () {
        return {
            expressNumber: '',
            tableData: [/* {
            date: '2016-05-02',
            status: '上海市普陀区金沙江路 1518 弄'
          } */]
        }
    },
    methods: {
        findExpress () {
            request ({
                url: '/api/trace/express',
                params: {
                    expressName: 'auto',
                    expressNumber: this.expressNumber
                }
            }).then (result => {
                let data = result.data.info
                let status = data.current
                let datas = data.context
                if (status === '暂无数据') {
                    this.tableData = []
                    this.$message(status)
                } else {
                    this.tableData = []
                    for (let i in datas) {
                        let express = {}
                        express.date = this.formatDateTime(datas[i].time * 1000)
                        express.status = datas[i].desc
                        this.tableData.push(express)
                    }

                }
            }).catch (err => {
                    this.tableData = []
                this.$message(err.message)
            })
        },
        formatDateTime (inputTime) {
                    var date = new Date(inputTime);
                    var y = date.getFullYear();
                    var m = date.getMonth() + 1;
                    m = m < 10 ? ('0' + m) : m;
                    var d = date.getDate();
                    d = d < 10 ? ('0' + d) : d;
                    var h = date.getHours();
                    h = h < 10 ? ('0' + h) : h;
                    var minute = date.getMinutes();
                    var second = date.getSeconds();
                    minute = minute < 10 ? ('0' + minute) : minute;
                    second = second < 10 ? ('0' + second) : second;
                    return y + '-' + m + '-' + d+' '+h+':'+minute+':'+second;
        }
    }
}

</script>

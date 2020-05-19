<template>
    <div>
        <el-input v-model="expressNumber" placeholder="请输入单号"></el-input>
        <el-input v-model="mail" placeholder="请输入邮箱"></el-input>
        <el-button type="primary" plain @click="dataSub">提交</el-button>
    </div>
</template>

<script>
import request from '../network/request'
export default {
    name: 'topCpn',
    data () {
        return {
            expressNumber: '',
            mail: ''
        }
    },
    methods: {

        dataSub () {
            request ({
                url: '/api/trace/addTrace',
                params: {
                    expressNumber: this.expressNumber,
                    mail: this.mail,
                    expressName: 'auto'
                }
            }).then (result => {
                console.log(result.data)
                let status = result.data.status
                if (status === 'success' ) {
                    this.$message('添加成功')
                } else {
                    this.$message('添加失败')
                }
            }).catch (err => this.$message (err.message))
        }

    }
}
</script>

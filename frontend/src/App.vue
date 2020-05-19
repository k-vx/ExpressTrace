<template>
  <div id="app">
     <el-col :span="2">
     
      <el-menu :default-active="$route.path" class="el-menu-vertical-demo" 
               theme="dark"
               router>
        <el-menu-item index="/trace/find">快递查询</el-menu-item>
        <el-menu-item index="/trace/trace">快递跟踪</el-menu-item>
      </el-menu>
    </el-col>
    <h2>{{notice}}</h2>
    <router-view></router-view>
  </div>
</template>

<script>

export default {
  name: 'App', 
  data() {
    return {
      notice: '暂不支持顺丰，仅支持大部分快递'
    }
  },
  methods: {

  }
}

/* @open="handleOpen" @close="handleClose" */
</script>

<style>
</style>

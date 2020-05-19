// 配置路由相关信息
import Vue from 'vue'
import Router from 'vue-router'
import contentCpn from '@/components/contentCpn'
import topCpn from '@/components/topCpn'

// 1. 通过Vue.use(插件) ，安装插件
Vue.use(Router)

// 2. 创建VueRouter对象
// 3. 将router对象传入到vue实例
export default new Router({
  // 配置路由和组件之间的映射关系
  routes: [
    {
      path: '/',
      redirect: '/trace/find'
    },
    {
      path: '/trace/find',
      name: 'contentCpn', 
      component: contentCpn
    },
    {
      path: '/trace/trace',
      name: 'topCpn',
      component: topCpn
    }
  ],
  mode: 'history' // html5中的history模式
})

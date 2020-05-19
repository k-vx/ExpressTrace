# 功能介绍
## 快递查询
-  通过爬取百度，获取物流信息
- 支持大部分快递，顺丰快递暂不支持。
## 快递跟踪
- 每间隔25分钟查询，并记录。
- 当物流更新，会以邮箱的方式发送到邮箱。

# 使用教程

## 后台部署

- 导入数据库
- 修改配置文件中的数据库账号和密码
- 使用smtp，将邮箱账号和smtp密钥填入。

- 直接运行即可

`/trace/express?expressName=快递名字&expressNumber=单号`查询物流信息。其中快递名字可以为auto
`/trace/addTrace` 物流跟踪

## 前台部署
最好装个node环境
使用npm。
进入前台目录终端运行
```bash
npm install
```

安装完成之后，运行

```bash
npm run dev
```

# 关于

- 代码并不规范
- 功能基本上能够使用

还在学习中... 欢迎给出建议
一起提升。
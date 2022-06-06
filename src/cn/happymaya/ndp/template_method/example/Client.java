package cn.happymaya.ndp.template_method.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("开始本地手动发布流程======");
        DeployFlow localDeployFlow = new LocalDeployFlow();
        localDeployFlow.buildFlow();
        System.out.println("********************");
        System.out.println("开始 CICD 发布流程======");

        DeployFlow cicdDeployFlow = new CicdDeployFlow();
        cicdDeployFlow.buildFlow();
    }
}
// 开始本地手动发布流程======
// 手动将代码拉取到本地电脑......
// 在本地电脑上手动执行编译打包......
// 手动通过 SSH 上传包到本地的测试服务......
// 执行手工测试......
// 统一自动上传 启动App包到对应线上服务器
// 统一自动 启动线上App
// ********************
// 开始 CICD 发布流程======
// 持续集成服务器将代码拉取到节点服务器上......
// 自动进行编译&打包......
// 自动将包拷贝到测试环境服务器......
// 执行自动化测试......
// 统一自动上传 启动App包到对应线上服务器
// 统一自动 启动线上App
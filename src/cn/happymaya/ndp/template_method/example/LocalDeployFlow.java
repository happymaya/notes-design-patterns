package cn.happymaya.ndp.template_method.example;

/* 实现本地的打包编译和上传 */
public class LocalDeployFlow extends DeployFlow{
    @Override
    public void pullCodeFromGitlab() {
        System.out.println("手动将代码拉取到本地电脑......");
    }
    @Override
    public void compileAndPackage() {
        System.out.println("在本地电脑上手动执行编译打包......");
    }
    @Override
    public void copyToTestServer() {
        System.out.println("手动通过 SSH 上传包到本地的测试服务......");
    }
    @Override
    public void testing() {
        System.out.println("执行手工测试......");
    }
}

package cn.happymaya.ndp.template_method.example;

public abstract class DeployFlow {

    /* 使用final关键字来约束步骤不能轻易修改 */
    public final void buildFlow() {
        /* 从GitLab上拉取代码 */
        pullCodeFromGitlab();
        /* 编译打包 */
        compileAndPackage();
        /* 部署测试环境 */
        copyToTestServer();
        /* 测试 */
        testing();
        /* 上传包到线上环境 */
        copyToRemoteServer();
        /* 启动程序 */
        startApp();
    }

    public abstract void pullCodeFromGitlab();

    public abstract void compileAndPackage();

    public abstract void copyToTestServer();

    public abstract void testing();

    private void copyToRemoteServer() {
        System.out.println("统一自动上传 启动App包到对应线上服务器");
    }
    private void startApp() {
        System.out.println("统一自动 启动线上App");
    }
}

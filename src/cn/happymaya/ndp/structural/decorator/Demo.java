package cn.happymaya.ndp.structural.decorator;

public class Demo {
    public static void main(String[] args) {
        String testInfo = "Name, testInfo\nMia, 10000\nMax, 9100";
        DataLoaderDecorator encoded = new CompressionDataDecorator(
                new EncryptionDataDecorator(
                        new BaseFileDataLoader("demo.txt")));
        encoded.write(testInfo);
        IDataLoader plain = new BaseFileDataLoader("demo.txt");
        System.out.println("- 输入 ----------------");
        System.out.println(testInfo);
        System.out.println("- 加密 + 压缩 写入文件--------------");
        System.out.println(plain.read());
        System.out.println("- 解密 + 解压 --------------");
        System.out.println(encoded.read());
    }
}

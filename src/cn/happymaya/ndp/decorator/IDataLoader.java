package cn.happymaya.ndp.decorator;

/* 抽象的文件读取接口 */
public interface IDataLoader {

    String read();

    void write(String data);

}

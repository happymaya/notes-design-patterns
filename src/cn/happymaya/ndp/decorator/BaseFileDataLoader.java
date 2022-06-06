package cn.happymaya.ndp.decorator;

import java.io.*;

/* 具体组件 */
public class BaseFileDataLoader implements IDataLoader {

    private String filePath;

    public BaseFileDataLoader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() {
        char[] buffer = null;
        File file = new File(filePath);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buffer);
    }

    @Override
    public void write(String data) {
        File file = new File(filePath);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

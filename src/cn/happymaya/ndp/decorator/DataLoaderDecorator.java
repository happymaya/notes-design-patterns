package cn.happymaya.ndp.decorator;

public class DataLoaderDecorator implements IDataLoader{

    private IDataLoader wrapper;

    public DataLoaderDecorator(IDataLoader wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String read() {
        return wrapper.read();
    }

    @Override
    public void write(String data) {
        wrapper.write(data);
    }

}

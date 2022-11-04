package TASK_MOD17.domain;

public abstract class Brand implements DB{
    protected String brandName;
    protected String model;
    protected static Long code;

    public void Carro(String brandName, String model, String code){
        this.brandName = brandName;
        this.model = model;
        this.code = Long.valueOf(code.trim());
    }

    @Override
    public Long getCode() {
        // TODO Auto-generated method stub
        return Brand.code;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void setCode(Long code) {
        Brand.code = code;
    }

    
}

package TASK_MOD17.dao;

import TASK_MOD17.domain.Brand;


public class BrandMapDAO extends Register<Brand>{

    public BrandMapDAO(){
        super();
        }

    @Override
    public Class<Brand> getClassType() {
        // TODO Auto-generated method stub
        return Brand.class;
    }

}


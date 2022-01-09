package com.onlinemall.product;

import com.onlinemall.common.MallCommonApplication;
import com.onlinemall.product.entity.BrandEntity;
import com.onlinemall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import com.onlinemall.product.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MallProductApplication.class)
class MallProductApplicationTests {

    @Resource
    BrandService brandService;



//    @Test
//    public void testFindPath(){
//        Long[] catelogPath = categoryService.findCatelogPath(225L);
//        log.info("完整路径：{}",Arrays.asList(catelogPath));
//    }


    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");

//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
        System.out.println("保存成功....");
//        brandService.save(brandEntity);
        brandService.updateById(brandEntity);


//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//        list.forEach((item) -> {
//            System.out.println(item);
//        });

    }

}

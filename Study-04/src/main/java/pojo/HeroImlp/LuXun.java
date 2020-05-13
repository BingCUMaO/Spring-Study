package pojo.HeroImlp;

import cn.BinGCU.pojo.Hero;
import cn.BinGCU.pojo.Lover;
import cn.BinGCU.pojo.LoverImpl.ZhuAn;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Data
public class LuXun implements Hero {

    @Autowired
    private String name;

    @Autowired
    @Qualifier("lover")
    private ZhuAn lover;
}

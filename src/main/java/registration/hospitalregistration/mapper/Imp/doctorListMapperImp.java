package registration.hospitalregistration.mapper.Imp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import registration.hospitalregistration.pojo.doctor;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * 通过此接口通过mybatis与数据库进行交互
 */
@Mapper
public interface doctorListMapperImp {

    @Select("select * from doctors")
    List<doctor> doctorList();

}

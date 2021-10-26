package oit.is.team15.work05.lec05.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface FruitMapper {

  @Select("select * from fruit")
  ArrayList<Fruit> selectAllFruit();

  @Select("select ID, NAME,PRICE from FRUIT WHERE ID = #{id}")
  Fruit selectById(int id);

  @Delete("DELETE FROM FRUIT WHERE ID =#{id}")
  boolean deleteById(int id);



}

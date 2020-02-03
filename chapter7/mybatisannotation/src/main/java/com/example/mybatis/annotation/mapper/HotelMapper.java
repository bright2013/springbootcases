/**
 *    Copyright 2015-2019 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.example.mybatis.annotation.mapper;


import com.example.mybatis.annotation.domain.Hotel;
import org.apache.ibatis.annotations.*;


@Mapper
public interface HotelMapper {

  @Select("SELECT city, name, address, zip from hotel WHERE city = #{cityId}")
  Hotel selectByCityId(int cityId);

  @Insert("INSERT into hotel(city, name, address, zip) VALUES(#{city}, #{name},#{address}, #{zip})")
  void insertHotel(Hotel hotel);

  @Update("UPDATE hotel SET name=#{name} WHERE city =#{cityid}")
  void updateHotel(Hotel hotel);

  @Delete("DELETE FROM hotel WHERE city =#{cityid}")
  void deleteHotel(int cityid);

}

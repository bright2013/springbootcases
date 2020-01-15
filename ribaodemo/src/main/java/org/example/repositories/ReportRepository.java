/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: CustomerRepository
 * Author:   hzg
 * Date:     2019-12-23 14:35
 * Description: 客户jpa示例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.example.repositories;

import org.example.models.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈日报jpa示例〉
 *
 * @author hbr
 * @create 2019-12-23
 * @since 1.0.0
 */
public interface ReportRepository extends JpaRepository<Report, Long> {

    List<Report> findAllByCreatedPersonEquals(String personName);

    List<Report> findAllByCreatedGroupEquals(String groupName);

}

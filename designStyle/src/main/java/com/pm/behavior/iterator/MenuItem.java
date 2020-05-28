package com.pm.behavior.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author pengcheng
 * @version V1.0
 * @description 菜单类
 * @date 2019/03/26 19:41
 */
@Data
@AllArgsConstructor
public class MenuItem {
    private int channe;
    private String name;
    private String description;
}

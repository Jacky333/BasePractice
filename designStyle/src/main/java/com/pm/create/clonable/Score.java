package com.pm.create.clonable;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/04/22 11:46
 */
@Data
@AllArgsConstructor
public class Score implements Serializable {
    private static final long serialVersionUID = 2510953675185043369L;
    private String subjectName;

    private Double scoreNumber;
}

package com.example.demo.entity.id;

import lombok.Data;
import java.beans.Transient;
import java.io.Serializable;

@Data
public class FredId implements Serializable {
    String seriesId;
    String observationDate;
//    @Transient //직렬화 포함 안됨(null)
}
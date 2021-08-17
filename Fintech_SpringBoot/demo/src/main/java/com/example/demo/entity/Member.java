package com.example.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue
    Long seq;
    String id;
    String name;
    String org;
    Boolean active;
}

//package com.example.demo.entity;
//
//import lombok.*;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//
//public class Member {
//    String id;
//    String name;
//    String org;
//}

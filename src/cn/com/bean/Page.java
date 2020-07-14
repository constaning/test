package cn.com.bean;

import org.springframework.stereotype.Component;

@Component
public class Page {
    private Integer firstPage;
    private Integer lastPage;
    private  Boolean hasnextPage;
    private Boolean hasPreviousPage;
    private Integer currentPage;
}

package com.veronika.advanced.pattern.structural.facade;


public interface DBFacade {
    void generateReport(String db, String reportType, String tableName);
}

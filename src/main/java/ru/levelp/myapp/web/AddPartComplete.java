package ru.levelp.myapp.web;

public class AddPartComplete {
    private String psrtId;
    private String title;
    private String supplierName;

    public AddPartComplete(String psrtId, String title, String supplierName) {
        this.psrtId = psrtId;
        this.title = title;
        this.supplierName = supplierName;
    }

    public String getPsrtId() {
        return psrtId;
    }

    public void setPsrtId(String psrtId) {
        this.psrtId = psrtId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}


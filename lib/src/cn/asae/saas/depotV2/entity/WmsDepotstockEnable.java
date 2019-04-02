package cn.asae.saas.depotV2.entity;

import java.math.BigDecimal;

public class WmsDepotstockEnable {
    private Integer id;

    private Integer platformId;

    private Integer depotId;

    private String productId;

    private BigDecimal enableamount;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public Integer getDepotId() {
        return depotId;
    }

    public void setDepotId(Integer depotId) {
        this.depotId = depotId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public BigDecimal getEnableamount() {
        return enableamount;
    }

    public void setEnableamount(BigDecimal enableamount) {
        this.enableamount = enableamount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}
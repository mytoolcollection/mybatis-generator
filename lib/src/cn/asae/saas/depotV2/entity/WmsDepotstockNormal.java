package cn.asae.saas.depotV2.entity;

import java.math.BigDecimal;

public class WmsDepotstockNormal {
    private Integer id;

    private Integer depotId;

    private Integer platformId;

    private String productId;

    private BigDecimal normalamount;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepotId() {
        return depotId;
    }

    public void setDepotId(Integer depotId) {
        this.depotId = depotId;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public BigDecimal getNormalamount() {
        return normalamount;
    }

    public void setNormalamount(BigDecimal normalamount) {
        this.normalamount = normalamount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}
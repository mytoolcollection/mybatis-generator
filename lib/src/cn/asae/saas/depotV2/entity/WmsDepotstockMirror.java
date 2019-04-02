package cn.asae.saas.depotV2.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WmsDepotstockMirror {
    private Integer id;

    private Integer platformId;

    private Integer depotId;

    private String productId;

    private BigDecimal normalamount;

    private String status;

    private Date mirrorTime;

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

    public Date getMirrorTime() {
        return mirrorTime;
    }

    public void setMirrorTime(Date mirrorTime) {
        this.mirrorTime = mirrorTime;
    }
}
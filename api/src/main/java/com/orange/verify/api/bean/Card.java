package com.orange.verify.api.bean;

import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;

/**
 * 软件充值卡
 * t_card
 * @author Orange
 * @date 2018/12/16
 */
@TableName("t_card")
@KeySequence("SEQ_TEST")
public class Card implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @TableField(value = "create_date",fill = FieldFill.INSERT)
    private Long createDate;

    @TableLogic
    private Integer delFlag;

    /**
     * 备注
     * remarks
     */
    private String remarks;

    @TableField(value = "update_date",fill = FieldFill.UPDATE)
    private Long updateDate;

    /**
     * 用户绑定id
     * account_id
     */
    private String accountId;

    /**
     * 充值卡号
     * card_number
     */
    private String cardNumber;

    /**
     * 卡类绑定id
     * card_type_id
     */
    private String cardTypeId;

    /**
     * 是否封停使用 0.不是 1.是的
     * closure
     */
    private Integer closure;

    /**
     * 软件绑定id
     * soft_id
     */
    private String softId;

    /**
     * 使用状态 0.不使用 1.使用
     * use_status
     */
    private Integer useStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public String getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(String cardTypeId) {
        this.cardTypeId = cardTypeId == null ? null : cardTypeId.trim();
    }

    public Integer getClosure() {
        return closure;
    }

    public void setClosure(Integer closure) {
        this.closure = closure;
    }

    public String getSoftId() {
        return softId;
    }

    public void setSoftId(String softId) {
        this.softId = softId == null ? null : softId.trim();
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }
}
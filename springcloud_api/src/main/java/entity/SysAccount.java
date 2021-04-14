package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.experimental.Accessors;
import org.checkerframework.checker.units.qual.Acceleration;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统账号表
 * </p>
 *
 * @author zhangyong
 * @since 2021-04-14
 */
@TableName("SYS_ACCOUNT")
@ApiModel(value="SysAccount对象", description="系统账号表")
@Accessors(chain = true)//链式写法 .set.set.set
public class SysAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "账号ID")
    @TableId(value = "ACCOUNT_ID", type = IdType.AUTO)
    private Long accountId;

    @ApiModelProperty(value = "昵称")
    @TableField("NICK_NAME")
    private String nickName;

    @ApiModelProperty(value = "手机号")
    @TableField("MOBILE_NUM")
    private String mobileNum;

    @ApiModelProperty(value = "账号密码")
    @TableField("PWD")
    private String pwd;

    @ApiModelProperty(value = "推广账号ID")
    @TableField("REF_ID")
    private Long refId;

    @ApiModelProperty(value = "推广路径")
    @TableField("REF_PATH")
    private String refPath;

    @ApiModelProperty(value = "是否供货商")
    @TableField("IS_SUPPLIER")
    private String isSupplier;

    @ApiModelProperty(value = "是否分销商")
    @TableField("IS_DISTRIBUTOR")
    private String isDistributor;

    @ApiModelProperty(value = "是否会员")
    @TableField("IS_MEMBER")
    private String isMember;

    @ApiModelProperty(value = "账号头像")
    @TableField("HEAD_URL")
    private String headUrl;

    @ApiModelProperty(value = "创建日期")
    @TableField("CREATE_TIME")
    private Date createTime;

    @ApiModelProperty(value = "账号状态")
    @TableField("STATUS")
    private String status;

    @ApiModelProperty(value = "性别")
    @TableField("GENDER")
    private String gender;

    @ApiModelProperty(value = "生日")
    @TableField("BIRTHDAY")
    private Date birthday;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public Long getRefId() {
        return refId;
    }

    public void setRefId(Long refId) {
        this.refId = refId;
    }
    public String getRefPath() {
        return refPath;
    }

    public void setRefPath(String refPath) {
        this.refPath = refPath;
    }
    public String getIsSupplier() {
        return isSupplier;
    }

    public void setIsSupplier(String isSupplier) {
        this.isSupplier = isSupplier;
    }
    public String getIsDistributor() {
        return isDistributor;
    }

    public void setIsDistributor(String isDistributor) {
        this.isDistributor = isDistributor;
    }
    public String getIsMember() {
        return isMember;
    }

    public void setIsMember(String isMember) {
        this.isMember = isMember;
    }
    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "SysAccount{" +
            "accountId=" + accountId +
            ", nickName=" + nickName +
            ", mobileNum=" + mobileNum +
            ", pwd=" + pwd +
            ", refId=" + refId +
            ", refPath=" + refPath +
            ", isSupplier=" + isSupplier +
            ", isDistributor=" + isDistributor +
            ", isMember=" + isMember +
            ", headUrl=" + headUrl +
            ", createTime=" + createTime +
            ", status=" + status +
            ", gender=" + gender +
            ", birthday=" + birthday +
        "}";
    }
}

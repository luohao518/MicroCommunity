package com.java110.dto.feeManualCollection;

import com.java110.dto.PageDto;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName FloorDto
 * @Description 人工托收数据层封装
 * @Author wuxw
 * @Date 2019/4/24 8:52
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/
public class FeeManualCollectionDto extends PageDto implements Serializable {

    private String squarePrice;
private String ownerName;
private String link;
private String roomArea;
private String remark;
private String state;
private String ownerId;
private String communityId;
private String collectionId;
private String roomId;
private String roomName;


    private Date createTime;

    private String statusCd = "0";


    public String getSquarePrice() {
        return squarePrice;
    }
public void setSquarePrice(String squarePrice) {
        this.squarePrice = squarePrice;
    }
public String getOwnerName() {
        return ownerName;
    }
public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
public String getLink() {
        return link;
    }
public void setLink(String link) {
        this.link = link;
    }
public String getRoomArea() {
        return roomArea;
    }
public void setRoomArea(String roomArea) {
        this.roomArea = roomArea;
    }
public String getRemark() {
        return remark;
    }
public void setRemark(String remark) {
        this.remark = remark;
    }
public String getState() {
        return state;
    }
public void setState(String state) {
        this.state = state;
    }
public String getOwnerId() {
        return ownerId;
    }
public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
public String getCommunityId() {
        return communityId;
    }
public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }
public String getCollectionId() {
        return collectionId;
    }
public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }
public String getRoomId() {
        return roomId;
    }
public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
public String getRoomName() {
        return roomName;
    }
public void setRoomName(String roomName) {
        this.roomName = roomName;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }
}

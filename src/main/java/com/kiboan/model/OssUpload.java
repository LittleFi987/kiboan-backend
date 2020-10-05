package com.kiboan.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "oss_upload")
public class OssUpload {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * md5值
     */
    private String md5;

    /**
     * 下载url
     */
    @Column(name = "download_url")
    private String downloadUrl;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 更新时间
     */
    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * 操作人
     */
    @Column(name = "updated_by")
    private String updatedBy;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取md5值
     *
     * @return md5 - md5值
     */
    public String getMd5() {
        return md5;
    }

    /**
     * 设置md5值
     *
     * @param md5 md5值
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * 获取下载url
     *
     * @return download_url - 下载url
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * 设置下载url
     *
     * @param downloadUrl 下载url
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取创建时间
     *
     * @return created_at - 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取更新时间
     *
     * @return updated_at - 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置更新时间
     *
     * @param updatedAt 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取操作人
     *
     * @return updated_by - 操作人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置操作人
     *
     * @param updatedBy 操作人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
package com.cyl.musiclake.mvp.model.music;

import java.io.Serializable;

/**
 * 作者：yonglong on 2016/8/16 23:36
 * 邮箱：643872807@qq.com
 * 版本：2.5
 */
public class OnlinePlaylist implements Serializable {
    private String title;
    /**
     * 1.新歌榜
     * 2.热歌榜
     *
     * 20.华语金曲榜
     * 21.欧美金曲榜
     * 24.影视金曲榜
     * 23.情歌对唱榜
     * 25.网络歌曲榜
     * 22.经典老歌榜
     * 11.摇滚榜
     *
     * 6.KTV热歌榜
     * 8.Billboard
     * 7.叱咤歌曲榜
     */
    private String type;
    private String coverUrl;
    private String coverbgUrl;
    private String music1;
    private String music2;
    private String music3;

    public String getCoverbgUrl() {
        return coverbgUrl;
    }

    public void setCoverbgUrl(String coverbgUrl) {
        this.coverbgUrl = coverbgUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getMusic1() {
        return music1;
    }

    public void setMusic1(String music1) {
        this.music1 = music1;
    }

    public String getMusic2() {
        return music2;
    }

    public void setMusic2(String music2) {
        this.music2 = music2;
    }

    public String getMusic3() {
        return music3;
    }

    public void setMusic3(String music3) {
        this.music3 = music3;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
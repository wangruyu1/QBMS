package cn.qtech.service;

import cn.qtech.domain.PaperCategory;
import cn.qtech.dto.BaseMessage;

import java.util.List;

/**
 * @author wangruyu
 * @since 2017/3/21-14:27
 */
public interface PaperCategoryService {
    public boolean addCategory(PaperCategory paperCategory);

    List<PaperCategory> queryCategories();

    boolean modifyCategory(PaperCategory paperCategory);

    boolean deleteCategory(String id);
}

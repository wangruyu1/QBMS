package cn.qtech.controller;

import cn.qtech.component.LocalMessageSource;
import cn.qtech.domain.PaperCategory;
import cn.qtech.dto.BaseMessage;
import cn.qtech.service.PaperCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

/**
 * @author wangruyu
 * @since 2017/3/21-13:47
 */
@RestController
@RequestMapping("/paper")
public class PaperCategoryController {
    @Autowired
    private PaperCategoryService paperCategoryService;
    @Autowired
    private LocalMessageSource messageSource;
    @Autowired
    private MessageSource messageSource2;

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public BaseMessage addCategory(@RequestBody PaperCategory paperCategory) {
        paperCategory.setCategoryId(UUID.randomUUID().toString());
        if (paperCategoryService.addCategory(paperCategory)) {
            return new BaseMessage(200, true, messageSource.getMessage("papercategory.add.success"));
        }
        return new BaseMessage(201, false, messageSource.getMessage("papercategory.add.failed"));
    }
    @RequestMapping(value = "/category/{id}", method = RequestMethod.PUT)
    public BaseMessage modifyCategory(@PathVariable("id")String id,@RequestBody PaperCategory paperCategory) {
        if (paperCategoryService.modifyCategory(paperCategory)) {
//            return new BaseMessage(200, true, messageSource2.getMessage("papercategory.modify.success",null,null, Locale.CHINA));
            return new BaseMessage(200, true, messageSource.getMessage("papercategory.modify.success"));
        }
        return new BaseMessage(201, false, messageSource.getMessage("papercategory.modify.failed"));
    }
    @RequestMapping(value = "/category/{id}", method = RequestMethod.DELETE)
    public BaseMessage deleteCategory(@PathVariable("id")String id) {
        if (paperCategoryService.deleteCategory(id)) {
            return new BaseMessage(200, true, messageSource.getMessage("papercategory.delete.success"));
        }
        return new BaseMessage(201, false, messageSource.getMessage("papercategory.delete.failed"));
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<PaperCategory> queryCategories() {
        return paperCategoryService.queryCategories();
    }
}

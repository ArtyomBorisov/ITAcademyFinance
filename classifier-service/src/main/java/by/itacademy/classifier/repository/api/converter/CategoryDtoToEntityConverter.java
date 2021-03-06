package by.itacademy.classifier.repository.api.converter;

import by.itacademy.classifier.model.Category;
import by.itacademy.classifier.repository.entity.CategoryEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryDtoToEntityConverter implements Converter<Category, CategoryEntity> {
    @Override
    public CategoryEntity convert(Category dto) {
        return CategoryEntity.Builder.createBuilder()
                .setId(dto.getId())
                .setDtCreate(dto.getDtCreate())
                .setDtUpdate(dto.getDtUpdate())
                .setTitle(dto.getTitle())
                .build();
    }
}

package com.heima.model.wemedia.dtos;

import com.heima.model.common.dtos.PageRequestDto;
import lombok.Data;

@Data

public class WmMaterialDto extends PageRequestDto {

    //1是收藏，0是未收藏
    private Short isCollection;
}

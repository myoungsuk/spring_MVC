package com.multi.mvc01.dto;

import com.multi.mvc01.entity.BbsEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BbsDTO {
	private Long id;
	private String title;
	private String content;
	private String writer;

//	public static ArticleDto from(Article entity) {
//		return new ArticleDto(
//				entity.getId(),
//				UserAccountDto.from(entity.getUserAccount()),
//				entity.getTitle(),
//				entity.getContent(),
//				entity.getHashtags().stream()
//						.map(HashtagDto::from)
//						.collect(Collectors.toUnmodifiableSet())
//				,
//				entity.getCreatedAt(),
//				entity.getCreatedBy(),
//				entity.getModifiedAt(),
//				entity.getModifiedBy()
//		);
//	}
	public static BbsDTO from(BbsEntity entity) {

		 return new BbsDTO(
				entity.getId(),
				entity.getTitle(),
				entity.getContent(),
				entity.getWriter()
		);
	}


}

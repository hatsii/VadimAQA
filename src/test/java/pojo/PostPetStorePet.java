package pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostPetStorePet {
	private List<String> photoUrls;
	private String name;
	private int id;
	private Category category;
	private List<TagsItem> tags;
	private String status;

	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Category {
		private String name;
		private int id;
	}

	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class TagsItem {
		private String name;
		private int id;
	}
}
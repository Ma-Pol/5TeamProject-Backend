package com.Jellabo.Team_miniPj_Backend.project;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.Jellabo.Team_miniPj_Backend.users.UserDTO;

public interface ProjectMapper {

	// 현재 프로젝트 정보 불러오기
	int projectCodeCheck(int code);
	int projectJoinCheck(@Param("code") int code, @Param("email") String email);
	ProjectDataDTO loadProjectInfo(int code, String email);

	// 현재 프로젝트 카테고리 불러오기
	List<String> loadCategories(int code);

	// 카테고리 생성
	int createCategoryProcess(CategoryDTO categoryData);

	// 카테고리 삭제
	void deleteCategoryPost(CategoryDTO categoryData);
	int deleteCategoryProcess(CategoryDTO categoryData);

	// 현재 프로젝트 참여자 목록 불러오기
	List<UserDTO> loadUserList(int code);

	// 멤버 추가
	int emailCheck(String email);

	int addUserProcess(@Param("code") int code, @Param("email") String email);

	// 멤버 추방
	int kickUserProcess(@Param("code") int code, @Param("email") String email);

	// 현재 프로젝트 정보 수정
	int resettingProjectProcess(ProjectDataDTO projectData);

	// 프로젝트 삭제
	int isCreator(ProjectDataDTO project);

	void dropReplesTable(String dropReplesTable);

	void dropCommentsTable(String dropCommentsTable);

	void dropPostsTable(String dropPostsTable);

	void deleteCategory(int code);

	void deleteJoinedProject(int code);

	int deleteProject(int code);

}

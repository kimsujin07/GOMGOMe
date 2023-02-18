package com.ezen.gomgome.common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.ezen.gomgome.entity.NoticeFiles;

public class FileUtils {

	public static NoticeFiles parseFileInfo(MultipartFile file,
			String attachPath) throws IOException {
		NoticeFiles noticeFile = new NoticeFiles();
		
		String noticeOriginFileNm = file.getOriginalFilename();
		
		//같은 파일명을 업로드했을 때 덮어써지지 않게 하기위한 실제 업로드되는 파일명 설정
		SimpleDateFormat formmater = new SimpleDateFormat("yyyyMMddHHmmss");
		Date nowDate = new Date();
		String nowDateStr = formmater.format(nowDate);
		UUID uuid = UUID.randomUUID();
		
		String noticeFileNm = nowDateStr + "_" + uuid.toString() + "_" + noticeOriginFileNm;
		
		String noticeFilePath = attachPath;
		
		//이미지인지 다른 파일형태인지 검사
		File checkFile = new File(noticeOriginFileNm);
		//업로드한 파일의 형식 가져옴(이미지파일들은 image/jpg, image/png ...)
		String type = Files.probeContentType(checkFile.toPath());
		
		if(type != null) {
			if(type.startsWith("image")) {
				noticeFile.setNoticeFileCate("img");
			} else {
				noticeFile.setNoticeFileCate("etc");
			}
		} else {
			noticeFile.setNoticeFileCate("etc");
		}
		
		noticeFile.setNoticeFileNm(noticeFileNm);
		noticeFile.setNoticeOriginFileNm(noticeOriginFileNm);
		noticeFile.setNoticeFilePath(noticeFilePath);

		
		
		return noticeFile;
	}
	
}

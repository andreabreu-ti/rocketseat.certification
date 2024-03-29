package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // Cria o contrutor com todos os atributos
@NoArgsConstructor // Cria o construtor vazio
public class CertificationStudentEntity {

	private UUID id;
	private UUID studentID;
	private String technology;
	private int grate;
	List<AnswersCertificationsEntity> answersCertificationsEntity;
}

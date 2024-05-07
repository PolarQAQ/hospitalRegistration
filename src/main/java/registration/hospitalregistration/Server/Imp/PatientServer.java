package registration.hospitalregistration.Server.Imp;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import registration.hospitalregistration.mapper.Imp.doctorMapper;
import registration.hospitalregistration.mapper.Imp.patientMapper;
import registration.hospitalregistration.mapper.Imp.registrationMapper;
import registration.hospitalregistration.pojo.Patient;


import java.time.LocalDateTime;
import java.util.List;

/**
 * @description: 病人服务端实现
 * @author: Young
 * @date: 2024/4/26 8:26
 */
@Service
public class PatientServer implements patientServerImp{

 @Resource
 private patientMapper pmp;
@Resource
private registrationMapper rmp;
 @Resource
 private doctorMapper dmp;
 public List<Patient> List() {
  return pmp.List();
 }
 public List<Patient> ListByDoctorId(Integer id) {
  return pmp.ListByDoctorId(id);
 }
 public List<Patient> ListByDepartmentId(Integer id) {
  return pmp.ListByDepartmentId(id);
 }

 /**
  * 删除病人的同时，对应的病历单也会删除
  * @param patient
  */
 @Transactional
 public void Update(Patient patient) {
  patient.setUpdateTime(LocalDateTime.now());
  pmp.Update(patient);
 }
 @Transactional
 public void Delete(Integer id) {
  rmp.registrationDeleteByPatientId(id);
  pmp.Delete(id);
 }
 @Transactional
 public void Add(Patient patient) {
  patient.setUpdateTime(LocalDateTime.now());
  pmp.Add(patient);
 }
 public Patient ListById(Integer id) {
  return pmp.ListById(id);
 }
}

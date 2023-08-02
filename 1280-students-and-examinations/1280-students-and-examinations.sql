SELECT a.student_id, a.student_name, a.subject_name, COUNT(E.subject_name) AS attended_exams
FROM (
  SELECT S.student_id, S.student_name, SB.subject_name
  FROM Students S
  CROSS JOIN Subjects SB
) AS a
LEFT JOIN Examinations E ON a.student_id = E.student_id AND a.subject_name = E.subject_name
GROUP BY a.student_id, a.student_name, a.subject_name
ORDER BY a.student_id, a.subject_name;
# API 명세서

## 📍일정 생성 (Create)
- Method: `POST`
- URL: `/schedules`

### Request Body
```
{
    "title": "일정제목",
    "content": "일정내용",
    "writer": "작성자명",
    "password": "비밀번호",
    "createdAt": "작성일",
    "updatedAt": "수정일"
}
```
### Response
```
{
    "id": 작성id,
    "title": "일정제목",
    "content": "일정내용",
    "writer": "작성자명",
    "createdAt": "작성일",
    "updatedAt": "수정일"
}
```

## 📍일정 조회 (Read)

### 전체 일정 조회 Response
- Method: `GET`
- URL: `/schedules`
```
{
    "id": 작성id,
    "title": "일정제목",
    "content": "일정내용",
    "writer": "작성자명",
    "createdAt": "작성일",
    "updatedAt": "수정일"
}
```
### 선택 일정 조회 Response
- Method: `GET`
- URL: `/schedules/{scheduleId}`
```
{
    "id": 작성id,
    "title": "일정제목",
    "content": "일정내용",
    "writer": "작성자명",
    "createdAt": "작성일",
    "updatedAt": "수정일"
}
```

## 📍일정 수정 (Update)
- Method: `PUT`
- URL: `/schedules/{scheduleId}`
### Request Body
```
{
    "title": "일정제목",
    "content": "일정내용",
    "writer": "작성자명",
    "updatedAt": "수정일"
}
```
### Response
```
{
    "id": 작성id,
    "title": "일정제목",
    "content": "일정내용",
    "writer": "작성자명",
    "createdAt": "작성일",
    "updatedAt": "수정일"
}
```

## 📍일정 삭제 (Delete)
- Method: `DELETE`
- URL: `/schedules/{scheduleId}`
### Request Body
```
{
  "password": "1234"
}
```
### Response
```
{
    "message": "삭제완료"
}
```

---

# ERD

![img_1.png](img_1.png)

---

# 질문 답변

## 1. 3 Layer Architecture(Controller, Service, Repository)를 적절히 적용했는지 확인해 보고, 왜 이러한 구조가 필요한지 작성해 주세요.
1. 역할 분리
2. 유지보수성 향상
3. 재사용성 증가

## 2. @RequestParam, @PathVariable, @RequestBody가 각각 어떤 어노테이션인지, 어떤 특징을 갖고 있는지 작성해 주세요.
### @RequestParam
쿼리 파라미터를 가져올 때 사용

특징
- 기본값 : required = true
- URL에서 ?key=value 형태에서 값 추출
### @PathVariable
URL 경로 자체에 포함된 값 가져올 때 사용 (/{scheduleId})

특징
- URL경로 일부를 변수처럼 사용
### @RequestBody
HTTP Body에 담긴 JSON 데이터를 객체로 변환

특징
- JSON -> java 객체 자동 변환
- 요청데이터 있을 때 주로 사용

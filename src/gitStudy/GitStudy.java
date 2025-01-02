package gitStudy;

public class GitStudy {
    public static void main(String[] args) {

        // 1. 코드 관리를 시작하는 명령어 - git init => 프로젝트 시작 전 딱 한번만 입력하면 됌

        // 2. 코드를 저장하는 명령어 - git add & git commit
        // 2. git add 파일명, git commit -m "메세지 작성" (메세지 부분은 내가 무슨 코드를 짰는지 상세히 작성)
        // 2. 내 프로젝트의 변경사항을 한 번에 지정하는 법
        // 2. git add . -> 점(.)은 나의 경로의 모든 변경 사항을 말한다.

        // 3. 만약 Please tell me who you are이라는 에러가 발생한 경우
        // 3. 나의 이메일, 이름을 등록해서 계정 설정 필요

        // 4. 저장 명령어가 git add, git commit 두개인 이유
        // 4. git add 파일명 -> 저장하기 전 저장할 파일 지정
        // 4. git commit -m "메세지 작성" -> 실제로 저장하는 명령어

        // 5. 저장 여부 확인하는 명령어 - git status
        // 5. 코드 변경은 있지만 저장을 하지 않은 파일은 "붉은색"으로 표시

        // 6. 저장 내역을 확인하는 명령어 - git log

        // 7. 추가로 수정된 코드 github에 반영하기 - git push
        // 7. git push origin 브랜치명

        // 첫 업로드 시 3개의 명령어
        // 1. git remote add origin <github>주소
        // 2. git branch -M main
        // 3. git push -u origin main

        // 코드 복사해오기 - git clone
        // 1. Github 레포지토리에서 github 주소를 복사합니다.
        // 2. 코드 작성할 폴더 생성 및 IDE에서 폴더를 열어줍니다.
        // 3. 터미널창에 git clone <github 주소> . => (.) 점 꼭 찍어주기 안그럼 경로가 달라짐

        // 다른 사람이 변경한 코드 내 코드에도 가져오기 - git pull
        // git pull origin 브랜치명

    }
}

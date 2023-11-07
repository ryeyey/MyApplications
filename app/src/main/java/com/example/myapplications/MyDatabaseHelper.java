// Firebaseにユーザー情報を保存
//FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference usersRef = database.getReference("users");
//
//// ユーザー情報を取得
//        String email = "user@example.com";
//        String password = "userPassword123";
//
//// ユーザーIDを生成する
//        String userId = usersRef.push().getKey();
//
//// ユーザー情報を設定
//        User user = new User(email, password); // Userオブジェクトを作成（任意のデータ構造に合わせて変更してください）
//        usersRef.child(userId).setValue(user); // ユーザー情報をデータベースに保存

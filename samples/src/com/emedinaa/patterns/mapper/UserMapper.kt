package com.emedinaa.patterns.mapper

/**
 * Created by eduardomedina on 6/04/17.
 */
class UserMapper {

    fun transform(userEntity: UserEntity?):User{

        val user:User= User()
        if(userEntity==null)return  user
        user.id= userEntity.userId
        user.name= userEntity.userName
        user.lastName= userEntity.userLastName
        user.dni= userEntity.document

        return user
    }
}
package com.soledede.recomend.ui

import com.soledede.recomend.entity.User

/**
  * Created by soledede on 2015/12/15.
  */
trait RecommendUI {

  def recommendByUser(user: User,number:Int): Seq[String] = null

  def recommendByUserId(userId: String,number:Int): Seq[String] = null

  def recommendByCatagoryByUser(user: User,number:Int): Seq[String] = null

}

object RecommendUI{
  def apply(rType: String = "default"): RecommendUI = {
    rType match {
      case "default" => GeneralRecommendUIImpl()
    }
  }
}

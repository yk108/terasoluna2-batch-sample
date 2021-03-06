*******************************************************************************
      TERASOLUNA Batch Framework for Java
      ブランクプロジェクト 導入手順

      Copyright 2007-2011 NTT DATA Corporation.
*******************************************************************************

■  概要：

  このreadmeは、TERASOLUNA Batch Framework for Javaのブランクプロジェクトを導入する手順書です。
  ブランクプロジェクトを導入することにより、TERASOLUNAフレームワークを使った
  アプリケーション開発環境を構築することが可能になります。 

■  前提条件：

  開発環境には、あらかじめ下記のものが用意されている必要があります。
  また併記されているバージョンを元に動作確認を行なっていますが、
  このバージョン以外の環境で動作を制限することを示すものではありません。
  また、これらのインストール及び設定の手順については、
  別途Web上の利用ガイド等を参照してください。 

  ・Java SE Runtime Environment Standard Edition 1.6.0
  ・Eclipse SDK 3.4.2 
  ・PostgreSQL Database Server 8.4	
  　または
  ・Oracle11g

■  Antタスク一覧：

  プロジェクトの「\ant」フォルダには、antタスクが記述された
  「build.xml」が存在します。以下にantタスクの一覧を記述します。

  ・zip
      このプロジェクトをZipファイルにしてdistフォルダに格納する。

        
■  プロジェクトのインポート：

  �@ZIPファイルの展開
    terasoluna-batch4j-blank_(バージョン番号).zipを任意のフォルダに展開します。 

    展開されたterasoluna-batch4j-blank_(バージョン番号).zipのフォルダ名が
    「terasoluna-batch-blank」であることを確認します。
    展開ツールや展開のしかたによっては、フォルダ名が
    「terasoluna-batch4j-blank_(バージョン番号)」となる場合がありますが、
    フォルダ名を手動で「terasoluna-batch-blank」に変更してください。 

  �AEclipseへのインポート
    ・Eclipse画面にて「ファイル＞インポート」を実行し、
      「一般＞既存プロジェクトをワークスペースへ」を選択し「次へ」をクリックします。
    ・「ルート・ディレクトリーの選択」にチェックが入った状態で「参照」をクリックし、
      プロジェクト内容のブラウズから�Aで展開したディレクトリを指定します。
    ・「プロジェクトをワークスペースへコピー」にチェックが入っていることを確認後、
      「終了」をクリックします。
 
■ TERASOLUNA Batch Framework for Javaが必要とするテーブルについて：

  TERASOLUNA Batch Framework for Javaが必要とするデータベースのテーブルは以下になります。
  ・ジョブ管理テーブル(JOB_CONTROL)
  ・リスタート管理テーブル(RESTART_CONTROL)
  ・ジョブ結果テーブル(JOB_RESULT)
  
  これらのテーブルを作成するDDLファイルは以下に配置されています。
  「sql\create_table.ddl」
  お使いの環境に合わせて適宜カスタマイズしてご使用ください。
    

-------------------------------------------------------------------------------
Copyright 2007-2011 NTT DATA Corporation.
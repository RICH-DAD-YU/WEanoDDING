package com.ssafy.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotice is a Querydsl query type for Notice
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNotice extends EntityPathBase<Notice> {

    private static final long serialVersionUID = 1574844698L;

    public static final QNotice notice = new QNotice("notice");

    public final StringPath noticeContent = createString("noticeContent");

    public final StringPath noticeDate = createString("noticeDate");

    public final StringPath noticeId = createString("noticeId");

    public final NumberPath<Integer> noticeNum = createNumber("noticeNum", Integer.class);

    public final StringPath noticeTitle = createString("noticeTitle");

    public QNotice(String variable) {
        super(Notice.class, forVariable(variable));
    }

    public QNotice(Path<? extends Notice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotice(PathMetadata metadata) {
        super(Notice.class, metadata);
    }

}


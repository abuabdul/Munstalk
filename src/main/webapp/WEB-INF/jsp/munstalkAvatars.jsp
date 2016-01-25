<%@ include file="/WEB-INF/jsp/includes/siteTags.jsp"%>
	<section>
	    <div class="avatar-div">
	      <c:url var="munsAvatarUrl" value="/muns/incarnate/avatar.go"/>
	      <form:form id="munstalkAvatar" class="form-horizontal" role="form" modelAttribute="munstalkAvatar" action="${munsAvatarUrl}" method="post">
	            <c:set var="abuDisabled" value="false"/>
	            <c:out value="${abuRepresentation}"/>
	            <c:out value="${munsRepresentation}"/>
	            <c:if test="${not empty abuRepresentation}">
	               <c:set var="abuDisabled" value="true"/>
	            </c:if>
	            <c:set var="munsDisabled" value="false"/>
	            <c:if test="${not empty munsRepresentation}">
	               <c:set var="munsDisabled" value="true"/>
	            </c:if>    
	            <div class="form-group">
	                <div class="btn-group" data-toggle="buttons">
					    <label class="btn btn-default" title="Husband" data-toggle="tooltip" data-placement="left"> 
						   <form:checkbox class="form-control no-border" path="abuRepresentation" value="true" checked="${abuDisabled}" disabled="${abuDisabled}"/>	
						   <span class="fa fa-heart fa-3x"></span>&nbsp; Abu									               		         
					    </label> 
					    <label class="btn btn-default" title="Better-Half" data-toggle="tooltip" data-placement="right"> 
					        <form:checkbox class="form-control no-border" path="munsRepresentation" value="true" checked="${munsDisabled}" disabled="${munsDisabled}"/>
					        <span class="fa fa-heart-o fa-3x"></span>&nbsp; Muns	 					               
						</label>
					 </div>	
				 </div>
				 <div class="form-group">
				      <button type="submit" class="btn btn-sm btn-primary">
				        Begin&nbsp;<span class="fa fa-comment fa-lg"></span>
				      </button>
				 </div>
		 </form:form>
	    </div>
	</section>


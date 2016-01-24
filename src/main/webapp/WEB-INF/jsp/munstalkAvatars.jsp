<%@ include file="/WEB-INF/jsp/includes/siteTags.jsp"%>
	<section>
	    <div class="avatar-div">
	      <c:url var="munAvatarUrl" value="/secure/muns/incarnate/avatar.go"/>
	      <form:form id="munstalkAvatar" class="form-horizontal" role="form" modelAttribute="munstalkAvatar" action="${munAvatarUrl}" method="post">
	            <div class="form-group">
	                <div class="btn-group" data-toggle="buttons">
					    <label class="btn btn-default" title="Husband" data-toggle="tooltip" data-placement="left"> 
						   <form:radiobutton class="form-control no-border" path="abuRepresentation" />	
							<span class="fa fa-heart fa-3x"></span>&nbsp; Abu								               		         
					    </label> 
					    <label class="btn btn-default" title="Better-Half" data-toggle="tooltip" data-placement="right"> 
					        <form:radiobutton class="form-control no-border" path="munsRepresentation" />
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
		 <%-- 	   
		                       <div class="col-sm-3"></div>
		                       <div class="col-sm-6">
								    <c:if test="${saveNoteDetails}">
										<div class="alert alert-success">
											<a href="#" class="close" data-dismiss="alert">&times;</a> 
											Noted!!!
										</div>
							        </c:if>
							   </div>
							   <div class="col-sm-3"></div>
			   </div>
	           
		  </form:form>   --%>
	    </div>
	</section>


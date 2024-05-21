/**
 */
package project2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see project2.Project2Factory
 * @model kind="package"
 * @generated
 */
public interface Project2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "project2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/project2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "project2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Project2Package eINSTANCE = project2.impl.Project2PackageImpl.init();

	/**
	 * The meta object id for the '{@link project2.impl.RobotModelImpl <em>Robot Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.RobotModelImpl
	 * @see project2.impl.Project2PackageImpl#getRobotModel()
	 * @generated
	 */
	int ROBOT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_MODEL__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_MODEL__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_MODEL__CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_MODEL__EXPRESSIONS = 3;

	/**
	 * The number of structural features of the '<em>Robot Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Robot Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project2.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.NamedElementImpl
	 * @see project2.impl.Project2PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 10;

	/**
	 * The meta object id for the '{@link project2.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.ActionImpl
	 * @see project2.impl.Project2PackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 1;

	/**
	 * The feature id for the '<em><b>Actionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIONNAME = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project2.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.EventImpl
	 * @see project2.impl.Project2PackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONDITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project2.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.ConditionImpl
	 * @see project2.impl.Project2PackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Conditionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITIONNAME = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project2.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.ButtonImpl
	 * @see project2.impl.Project2PackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 4;

	/**
	 * The feature id for the '<em><b>Conditionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONDITIONNAME = CONDITION__CONDITIONNAME;

	/**
	 * The feature id for the '<em><b>Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BUTTON = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project2.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.SensorImpl
	 * @see project2.impl.Project2PackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 5;

	/**
	 * The feature id for the '<em><b>Conditionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONDITIONNAME = CONDITION__CONDITIONNAME;

	/**
	 * The feature id for the '<em><b>Sensor Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_POS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DISTANCE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project2.impl.SoundImpl <em>Sound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.SoundImpl
	 * @see project2.impl.Project2PackageImpl#getSound()
	 * @generated
	 */
	int SOUND = 6;

	/**
	 * The feature id for the '<em><b>Conditionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND__CONDITIONNAME = CONDITION__CONDITIONNAME;

	/**
	 * The number of structural features of the '<em>Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project2.impl.TapImpl <em>Tap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.TapImpl
	 * @see project2.impl.Project2PackageImpl#getTap()
	 * @generated
	 */
	int TAP = 7;

	/**
	 * The feature id for the '<em><b>Conditionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP__CONDITIONNAME = CONDITION__CONDITIONNAME;

	/**
	 * The number of structural features of the '<em>Tap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project2.impl.MotorActionImpl <em>Motor Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.MotorActionImpl
	 * @see project2.impl.Project2PackageImpl#getMotorAction()
	 * @generated
	 */
	int MOTOR_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Actionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_ACTION__ACTIONNAME = ACTION__ACTIONNAME;

	/**
	 * The feature id for the '<em><b>Motor Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_ACTION__MOTOR_LEFT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Motor Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_ACTION__MOTOR_RIGHT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_ACTION__RIGHT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_ACTION__LEFT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Motor Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Motor Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project2.impl.SoundActionImpl <em>Sound Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.SoundActionImpl
	 * @see project2.impl.Project2PackageImpl#getSoundAction()
	 * @generated
	 */
	int SOUND_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Actionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_ACTION__ACTIONNAME = ACTION__ACTIONNAME;

	/**
	 * The feature id for the '<em><b>Musicsettings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_ACTION__MUSICSETTINGS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sound Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sound Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project2.impl.LightActionImpl <em>Light Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.LightActionImpl
	 * @see project2.impl.Project2PackageImpl#getLightAction()
	 * @generated
	 */
	int LIGHT_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Actionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_ACTION__ACTIONNAME = ACTION__ACTIONNAME;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_ACTION__RED = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_ACTION__GREEN = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_ACTION__BLUE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_ACTION__POS = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Light Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Light Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project2.impl.MusicSettingImpl <em>Music Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.MusicSettingImpl
	 * @see project2.impl.Project2PackageImpl#getMusicSetting()
	 * @generated
	 */
	int MUSIC_SETTING = 12;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_SETTING__NOTE = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_SETTING__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_SETTING__POS = 2;

	/**
	 * The number of structural features of the '<em>Music Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_SETTING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Music Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project2.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.impl.ExpressionImpl
	 * @see project2.impl.Project2PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LEFT = 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__BOOL = 4;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project2.ButtonType <em>Button Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.ButtonType
	 * @see project2.impl.Project2PackageImpl#getButtonType()
	 * @generated
	 */
	int BUTTON_TYPE = 14;

	/**
	 * The meta object id for the '{@link project2.LightPos <em>Light Pos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.LightPos
	 * @see project2.impl.Project2PackageImpl#getLightPos()
	 * @generated
	 */
	int LIGHT_POS = 15;

	/**
	 * The meta object id for the '{@link project2.Duration <em>Duration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.Duration
	 * @see project2.impl.Project2PackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 16;

	/**
	 * The meta object id for the '{@link project2.Distance <em>Distance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project2.Distance
	 * @see project2.impl.Project2PackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 17;

	/**
	 * Returns the meta object for class '{@link project2.RobotModel <em>Robot Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Model</em>'.
	 * @see project2.RobotModel
	 * @generated
	 */
	EClass getRobotModel();

	/**
	 * Returns the meta object for the containment reference list '{@link project2.RobotModel#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see project2.RobotModel#getEvents()
	 * @see #getRobotModel()
	 * @generated
	 */
	EReference getRobotModel_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link project2.RobotModel#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see project2.RobotModel#getActions()
	 * @see #getRobotModel()
	 * @generated
	 */
	EReference getRobotModel_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link project2.RobotModel#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see project2.RobotModel#getConditions()
	 * @see #getRobotModel()
	 * @generated
	 */
	EReference getRobotModel_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link project2.RobotModel#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see project2.RobotModel#getExpressions()
	 * @see #getRobotModel()
	 * @generated
	 */
	EReference getRobotModel_Expressions();

	/**
	 * Returns the meta object for class '{@link project2.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see project2.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link project2.Action#getActionname <em>Actionname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actionname</em>'.
	 * @see project2.Action#getActionname()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Actionname();

	/**
	 * Returns the meta object for class '{@link project2.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see project2.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference list '{@link project2.Event#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conditions</em>'.
	 * @see project2.Event#getConditions()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Conditions();

	/**
	 * Returns the meta object for the reference list '{@link project2.Event#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see project2.Event#getActions()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Actions();

	/**
	 * Returns the meta object for class '{@link project2.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see project2.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link project2.Condition#getConditionname <em>Conditionname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditionname</em>'.
	 * @see project2.Condition#getConditionname()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Conditionname();

	/**
	 * Returns the meta object for class '{@link project2.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see project2.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link project2.Button#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button</em>'.
	 * @see project2.Button#getButton()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Button();

	/**
	 * Returns the meta object for class '{@link project2.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see project2.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link project2.Sensor#getSensorPos <em>Sensor Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Pos</em>'.
	 * @see project2.Sensor#getSensorPos()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_SensorPos();

	/**
	 * Returns the meta object for the attribute '{@link project2.Sensor#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see project2.Sensor#getDistance()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Distance();

	/**
	 * Returns the meta object for class '{@link project2.Sound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound</em>'.
	 * @see project2.Sound
	 * @generated
	 */
	EClass getSound();

	/**
	 * Returns the meta object for class '{@link project2.Tap <em>Tap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap</em>'.
	 * @see project2.Tap
	 * @generated
	 */
	EClass getTap();

	/**
	 * Returns the meta object for class '{@link project2.MotorAction <em>Motor Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor Action</em>'.
	 * @see project2.MotorAction
	 * @generated
	 */
	EClass getMotorAction();

	/**
	 * Returns the meta object for the attribute '{@link project2.MotorAction#getMotorLeft <em>Motor Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motor Left</em>'.
	 * @see project2.MotorAction#getMotorLeft()
	 * @see #getMotorAction()
	 * @generated
	 */
	EAttribute getMotorAction_MotorLeft();

	/**
	 * Returns the meta object for the attribute '{@link project2.MotorAction#getMotorRight <em>Motor Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motor Right</em>'.
	 * @see project2.MotorAction#getMotorRight()
	 * @see #getMotorAction()
	 * @generated
	 */
	EAttribute getMotorAction_MotorRight();

	/**
	 * Returns the meta object for the containment reference '{@link project2.MotorAction#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see project2.MotorAction#getRight()
	 * @see #getMotorAction()
	 * @generated
	 */
	EReference getMotorAction_Right();

	/**
	 * Returns the meta object for the containment reference '{@link project2.MotorAction#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see project2.MotorAction#getLeft()
	 * @see #getMotorAction()
	 * @generated
	 */
	EReference getMotorAction_Left();

	/**
	 * Returns the meta object for class '{@link project2.SoundAction <em>Sound Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Action</em>'.
	 * @see project2.SoundAction
	 * @generated
	 */
	EClass getSoundAction();

	/**
	 * Returns the meta object for the containment reference list '{@link project2.SoundAction#getMusicsettings <em>Musicsettings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Musicsettings</em>'.
	 * @see project2.SoundAction#getMusicsettings()
	 * @see #getSoundAction()
	 * @generated
	 */
	EReference getSoundAction_Musicsettings();

	/**
	 * Returns the meta object for class '{@link project2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see project2.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link project2.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see project2.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link project2.LightAction <em>Light Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Action</em>'.
	 * @see project2.LightAction
	 * @generated
	 */
	EClass getLightAction();

	/**
	 * Returns the meta object for the attribute '{@link project2.LightAction#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see project2.LightAction#getRed()
	 * @see #getLightAction()
	 * @generated
	 */
	EAttribute getLightAction_Red();

	/**
	 * Returns the meta object for the attribute '{@link project2.LightAction#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see project2.LightAction#getGreen()
	 * @see #getLightAction()
	 * @generated
	 */
	EAttribute getLightAction_Green();

	/**
	 * Returns the meta object for the attribute '{@link project2.LightAction#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see project2.LightAction#getBlue()
	 * @see #getLightAction()
	 * @generated
	 */
	EAttribute getLightAction_Blue();

	/**
	 * Returns the meta object for the attribute '{@link project2.LightAction#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see project2.LightAction#getPos()
	 * @see #getLightAction()
	 * @generated
	 */
	EAttribute getLightAction_Pos();

	/**
	 * Returns the meta object for class '{@link project2.MusicSetting <em>Music Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music Setting</em>'.
	 * @see project2.MusicSetting
	 * @generated
	 */
	EClass getMusicSetting();

	/**
	 * Returns the meta object for the attribute '{@link project2.MusicSetting#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see project2.MusicSetting#getNote()
	 * @see #getMusicSetting()
	 * @generated
	 */
	EAttribute getMusicSetting_Note();

	/**
	 * Returns the meta object for the attribute '{@link project2.MusicSetting#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see project2.MusicSetting#getDuration()
	 * @see #getMusicSetting()
	 * @generated
	 */
	EAttribute getMusicSetting_Duration();

	/**
	 * Returns the meta object for the attribute '{@link project2.MusicSetting#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see project2.MusicSetting#getPos()
	 * @see #getMusicSetting()
	 * @generated
	 */
	EAttribute getMusicSetting_Pos();

	/**
	 * Returns the meta object for class '{@link project2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see project2.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link project2.Expression#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see project2.Expression#getOperation()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link project2.Expression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see project2.Expression#getLeft()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link project2.Expression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see project2.Expression#getRight()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link project2.Expression#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool</em>'.
	 * @see project2.Expression#getBool()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Bool();

	/**
	 * Returns the meta object for the attribute '{@link project2.Expression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see project2.Expression#getValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Value();

	/**
	 * Returns the meta object for enum '{@link project2.ButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Button Type</em>'.
	 * @see project2.ButtonType
	 * @generated
	 */
	EEnum getButtonType();

	/**
	 * Returns the meta object for enum '{@link project2.LightPos <em>Light Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Light Pos</em>'.
	 * @see project2.LightPos
	 * @generated
	 */
	EEnum getLightPos();

	/**
	 * Returns the meta object for enum '{@link project2.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration</em>'.
	 * @see project2.Duration
	 * @generated
	 */
	EEnum getDuration();

	/**
	 * Returns the meta object for enum '{@link project2.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distance</em>'.
	 * @see project2.Distance
	 * @generated
	 */
	EEnum getDistance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Project2Factory getProject2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link project2.impl.RobotModelImpl <em>Robot Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.RobotModelImpl
		 * @see project2.impl.Project2PackageImpl#getRobotModel()
		 * @generated
		 */
		EClass ROBOT_MODEL = eINSTANCE.getRobotModel();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_MODEL__EVENTS = eINSTANCE.getRobotModel_Events();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_MODEL__ACTIONS = eINSTANCE.getRobotModel_Actions();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_MODEL__CONDITIONS = eINSTANCE.getRobotModel_Conditions();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_MODEL__EXPRESSIONS = eINSTANCE.getRobotModel_Expressions();

		/**
		 * The meta object literal for the '{@link project2.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.ActionImpl
		 * @see project2.impl.Project2PackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Actionname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTIONNAME = eINSTANCE.getAction_Actionname();

		/**
		 * The meta object literal for the '{@link project2.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.EventImpl
		 * @see project2.impl.Project2PackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONDITIONS = eINSTANCE.getEvent_Conditions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ACTIONS = eINSTANCE.getEvent_Actions();

		/**
		 * The meta object literal for the '{@link project2.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.ConditionImpl
		 * @see project2.impl.Project2PackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Conditionname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITIONNAME = eINSTANCE.getCondition_Conditionname();

		/**
		 * The meta object literal for the '{@link project2.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.ButtonImpl
		 * @see project2.impl.Project2PackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__BUTTON = eINSTANCE.getButton_Button();

		/**
		 * The meta object literal for the '{@link project2.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.SensorImpl
		 * @see project2.impl.Project2PackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Sensor Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__SENSOR_POS = eINSTANCE.getSensor_SensorPos();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__DISTANCE = eINSTANCE.getSensor_Distance();

		/**
		 * The meta object literal for the '{@link project2.impl.SoundImpl <em>Sound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.SoundImpl
		 * @see project2.impl.Project2PackageImpl#getSound()
		 * @generated
		 */
		EClass SOUND = eINSTANCE.getSound();

		/**
		 * The meta object literal for the '{@link project2.impl.TapImpl <em>Tap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.TapImpl
		 * @see project2.impl.Project2PackageImpl#getTap()
		 * @generated
		 */
		EClass TAP = eINSTANCE.getTap();

		/**
		 * The meta object literal for the '{@link project2.impl.MotorActionImpl <em>Motor Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.MotorActionImpl
		 * @see project2.impl.Project2PackageImpl#getMotorAction()
		 * @generated
		 */
		EClass MOTOR_ACTION = eINSTANCE.getMotorAction();

		/**
		 * The meta object literal for the '<em><b>Motor Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR_ACTION__MOTOR_LEFT = eINSTANCE.getMotorAction_MotorLeft();

		/**
		 * The meta object literal for the '<em><b>Motor Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR_ACTION__MOTOR_RIGHT = eINSTANCE.getMotorAction_MotorRight();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_ACTION__RIGHT = eINSTANCE.getMotorAction_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_ACTION__LEFT = eINSTANCE.getMotorAction_Left();

		/**
		 * The meta object literal for the '{@link project2.impl.SoundActionImpl <em>Sound Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.SoundActionImpl
		 * @see project2.impl.Project2PackageImpl#getSoundAction()
		 * @generated
		 */
		EClass SOUND_ACTION = eINSTANCE.getSoundAction();

		/**
		 * The meta object literal for the '<em><b>Musicsettings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOUND_ACTION__MUSICSETTINGS = eINSTANCE.getSoundAction_Musicsettings();

		/**
		 * The meta object literal for the '{@link project2.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.NamedElementImpl
		 * @see project2.impl.Project2PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link project2.impl.LightActionImpl <em>Light Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.LightActionImpl
		 * @see project2.impl.Project2PackageImpl#getLightAction()
		 * @generated
		 */
		EClass LIGHT_ACTION = eINSTANCE.getLightAction();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_ACTION__RED = eINSTANCE.getLightAction_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_ACTION__GREEN = eINSTANCE.getLightAction_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_ACTION__BLUE = eINSTANCE.getLightAction_Blue();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_ACTION__POS = eINSTANCE.getLightAction_Pos();

		/**
		 * The meta object literal for the '{@link project2.impl.MusicSettingImpl <em>Music Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.MusicSettingImpl
		 * @see project2.impl.Project2PackageImpl#getMusicSetting()
		 * @generated
		 */
		EClass MUSIC_SETTING = eINSTANCE.getMusicSetting();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC_SETTING__NOTE = eINSTANCE.getMusicSetting_Note();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC_SETTING__DURATION = eINSTANCE.getMusicSetting_Duration();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC_SETTING__POS = eINSTANCE.getMusicSetting_Pos();

		/**
		 * The meta object literal for the '{@link project2.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.impl.ExpressionImpl
		 * @see project2.impl.Project2PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__OPERATION = eINSTANCE.getExpression_Operation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__BOOL = eINSTANCE.getExpression_Bool();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

		/**
		 * The meta object literal for the '{@link project2.ButtonType <em>Button Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.ButtonType
		 * @see project2.impl.Project2PackageImpl#getButtonType()
		 * @generated
		 */
		EEnum BUTTON_TYPE = eINSTANCE.getButtonType();

		/**
		 * The meta object literal for the '{@link project2.LightPos <em>Light Pos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.LightPos
		 * @see project2.impl.Project2PackageImpl#getLightPos()
		 * @generated
		 */
		EEnum LIGHT_POS = eINSTANCE.getLightPos();

		/**
		 * The meta object literal for the '{@link project2.Duration <em>Duration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.Duration
		 * @see project2.impl.Project2PackageImpl#getDuration()
		 * @generated
		 */
		EEnum DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '{@link project2.Distance <em>Distance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project2.Distance
		 * @see project2.impl.Project2PackageImpl#getDistance()
		 * @generated
		 */
		EEnum DISTANCE = eINSTANCE.getDistance();

	}

} //Project2Package
